import React from 'react';
import { useNavigate } from 'react-router-dom';
import '@mui/material';

function Services() {
    return (
    <section style={{ padding: '3rem 2rem', textAlign: 'center' }}>
          <h2>Services We Offer!</h2>
          <div style={{
            display: 'flex',
            justifyContent: 'center',
            gap: '2rem',
            flexWrap: 'wrap',
            marginTop: '2rem'
          }}>
            {[
              {
                title: 'Pet Grooming',
                img: 'public/Pictures/service1.png',
                desc: 'Reveal expert insights.',
                link: '/'
              },
              {
                title: 'Adoption',
                img: 'public/Pictures/service2.png',
                desc: 'Download trusted resources.',
                link: '/'
              },
              {
                title: 'Medical Services',
                img: 'public/Pictures/service3.png',
                desc: 'Explore pet care articles.',
                link: '/'
              }
            ].map((card, i) => (
              <div
                key={i}
                onClick={() => navigate(card.link)}
                className="hover-card"
                style={{
                  width: 300,
                  height: 250,
                  backgroundImage: `url(${card.img})`,
                  backgroundSize: 'cover',
                  backgroundPosition: 'center',
                  borderRadius: '12px',
                  padding: '1rem',
                  color: 'Black',
                  position: 'relative',
                  cursor: 'pointer',
                  textAlign: 'left',
                  boxShadow: '0 4px 12px rgba(0,0,0,0.2)'
                }}
              >
                <div style={{ padding: '0.5rem 1rem' }}>
                  <h4 style={{ margin: 0 }}>{card.title}</h4>
                  <p style={{ margin: '0.3rem 0' }}>{card.desc}</p>
                  <p style={{ fontWeight: 600 }}>Learn More →</p>
                </div>
              </div>
            ))}
          </div>
        </section>);
}

export default Services;